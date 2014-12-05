/********* CDVUsableSpace.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>
#import "CDVUsableSpace.h"

@interface CDVUsableSpace () {}

@end

@implementation CDVUsableSpace

- (void)getUsableSpace:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    //NSString* echo = [command.arguments objectAtIndex:0];
    
    @try{
        long long freeSpace = [[[[NSFileManager defaultManager] attributesOfFileSystemForPath:NSHomeDirectory() error:nil] objectForKey:NSFileSystemFreeSize] longLongValue];
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString: [NSString stringWithFormat:@"%lld", freeSpace]];
    }
    @catch (NSException *exception){
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
